package com.security.infraestructure.controller;

import com.security.application.service.OptionGroupService;
import com.security.domain.model.OptionGroup;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/optionGroup")
public class OptionGroupController {
    private final OptionGroupService optionGroupService;

    public OptionGroupController(OptionGroupService optionGroupService) {
        this.optionGroupService = optionGroupService;
    }

    @GetMapping("/")
    public ResponseEntity<List<OptionGroup>> getAllOptionGroups(){
        List<OptionGroup> optionGroups = optionGroupService.getAllOptionGroups();
        return new ResponseEntity<>(optionGroups, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<OptionGroup> getOptionGroupById(@PathVariable Long id){
        return optionGroupService.getOptionGroupById(id)
                .map(optionGroup -> new ResponseEntity<>(optionGroup, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/")
    public ResponseEntity<OptionGroup> createOptionGroup(@RequestBody OptionGroup optionGroup){
        OptionGroup createdOptionGroup = optionGroupService.createOptionGroup(optionGroup);
        return new ResponseEntity<>(createdOptionGroup, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<OptionGroup> updateOptionGroup(@PathVariable Long id, @RequestBody OptionGroup optionGroup){
        return optionGroupService.updateOptionGroup(id, optionGroup)
                .map(optionGroupk -> new ResponseEntity<>(optionGroupk, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteOptionGroupById(@PathVariable Long id){
        return (optionGroupService.deleteOptionGroup(id)) ? ResponseEntity.ok("OptionGroup deleted.") : new ResponseEntity<>("OptionGroup not found", HttpStatus.NOT_FOUND);
    }
}
