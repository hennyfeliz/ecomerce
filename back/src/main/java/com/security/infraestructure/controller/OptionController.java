package com.security.infraestructure.controller;

import com.security.application.service.OptionService;
import com.security.domain.model.Option;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/option")
public class OptionController {
    private final OptionService optionService;

    public OptionController(OptionService optionService) {
        this.optionService = optionService;
    }

    @GetMapping("/")
    public ResponseEntity<List<Option>> getAllOptions(){
        List<Option> options = optionService.getAllOptions();
        return new ResponseEntity<>(options, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Option> getOptionById(@PathVariable Long id){
        return optionService.getOptionById(id)
                .map(option -> new ResponseEntity<>(option, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<Option> createOption(@RequestBody Option option){
        Option createdOption = optionService.createOption(option);
        return new ResponseEntity<>(createdOption, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Option> updateOption(@PathVariable Long id, @RequestBody Option option){
        return optionService.updateOption(id, option)
                .map(optionk -> new ResponseEntity<>(optionk, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOptionById(@PathVariable Long id){
        return (optionService.deleteOption(id)) ? ResponseEntity.ok("Option deleted.") : new ResponseEntity<>("Option not found", HttpStatus.NOT_FOUND);
    }
}
