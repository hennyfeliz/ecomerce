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

  useEffect(() => {
    fetchData('GET', '/product/', (data) => {
      setOriginalElements(data);
      setElements(data);
    });
  }, []);

  return (
    <>
      <div className="filtro-productos">
        <span>Búscar productos</span>
        <input placeholder='Filtrar productos' onChange={filter} />
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



