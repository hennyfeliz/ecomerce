import '../../Styles/Elements.css'
import productIcon from './assets/error.svg'
import Modal from '../Modal/Modal'
import { useEffect, useState } from 'react'
import fetchData from '../../fetch/axiosFetch'

const Elements = () => {

  const [isModalOpen, setIsModalOpen] = useState(false);
  const [selectedModalData, setSelectedModalData] = useState({}); // Datos para el modal
  const [elements, setElements] = useState([]);
  const [originalElements, setOriginalElements] = useState([]);
  const [sortBy, setSortBy] = useState(''); // Estado para el criterio de ordenamiento
  const [priceRange, setPriceRange] = useState(100); // Estado para el rango de precios

  const handlePriceRangeChange = (e) => {
    setPriceRange(parseInt(e.target.value));
    filterByPrice(priceRange); // Filtrar por rango de precios
  };

  const filterByPrice = (range) => {
    const filteredElements = originalElements.filter(item => item.price <= range);
    setElements(filteredElements);
  };

  const sortElements = () => {
    let sorted = [...elements];

    if (sortBy === 'price') {
      sorted.sort((a, b) => a.price - b.price);
    } else if (sortBy === 'name') {
      sorted.sort((a, b) => a.name.localeCompare(b.name));
    }
    setElements(sorted);
  };

  const openModal = (element) => {
    setSelectedModalData(element);
    setIsModalOpen(true);
  };

  const closeModal = () => {
    setIsModalOpen(false);
  };

  const filter = (e) => {
    console.log(e.target.value)
    const searchTerm = e.target.value.toLowerCase();
    if (searchTerm === '') {
      setElements(originalElements);
    } else {
      const filteredElements = originalElements.filter(item =>
        item.name.toLowerCase().includes(searchTerm) ||
        item.cartDesc.toLowerCase().includes(searchTerm)
      );
      setElements(filteredElements);
    }
  }


  const handleResize = () => {
    const elementsContainer = document.querySelector('.elements');
    if (window.innerWidth <= 814) {
      elementsContainer.classList.add('hidden');
    } else {
      elementsContainer.classList.remove('hidden');
    }
  };

  useEffect(() => {
    fetchData('GET', '/product/', (data) => {
      setOriginalElements(data);
      setElements(data);
    });

    // Agregar el listener para el evento resize
    window.addEventListener('resize', handleResize);
    handleResize(); // Llamarlo inicialmente para establecer la visibilidad

    return () => {
      // Remover el listener cuando el componente se desmonte
      window.removeEventListener('resize', handleResize);
    };
  }, []);

  return (
    <>
      <div className="todos-los-filtros filtro-productos">
        <div className="filtro-productos">
          <h3>Búscar productos</h3>
          <input placeholder='Filtrar productos' onChange={filter} />
        </div>
        <div className="filtro-productos">
          <h3>Ordenar productos:</h3>
          <select value={sortBy} onChange={(e) => setSortBy(e.target.value)}>
            <option value="">Seleccionar</option>
            <option value="price">Precio</option>
            <option value="name">Nombre</option>
          </select>
          <button className="button-ord" onClick={sortElements}>Ordenar</button>
        </div>
        <div className="filtro-productos">
          <h3>Rango de precios:</h3>
          <input
            type="range"
            min="0"
            max="150"
            step="10"
            value={priceRange}
            className="custom-range-input"
            onChange={handlePriceRangeChange}
          />
          <span>{priceRange}</span>
        </div>
      </div>
      <div className="elements">
        {
          elements.map((item, index) => {
            return (
              <div key={index}>
                <div className="element" onClick={() =>
                  openModal(item)
                }>
                  <img
                    alt="product-icon"
                    src={productIcon}
                    style={{ width: "200px", height: "200px", margin: "10px auto" }}
                  />
                  <div>
                    <span>$ {item.price} </span>
                    <h3>{item.name} </h3>
                    <span>{item.cartDesc} </span>
                  </div>
                </div>
                <Modal
                  isOpen={isModalOpen}
                  closeModal={closeModal}
                  data={selectedModalData}
                />
              </div>
            )
          })
        }
      </div>
    </>
  )
}



export default Elements



