import '../../Styles/Elements.css'
import productIcon from './assets/error.svg'
import Modal from '../Modal/Modal'
import { useState } from 'react'

const Elements = () => {

  const [isModalOpen, setIsModalOpen] = useState(false);
  const [selectedModalData, setSelectedModalData] = useState({}); // Datos para el modal

  const elements = [
    { id: 1, name: 'zapatos', description: 'zapatos baratos' },
    { id: 2, name: 'corbata', description: 'corbata barata' },
    // ... otros elementos
  ];

  const openModal = (elements) => {
    setSelectedModalData(elements);
    setIsModalOpen(true);
  };

  const closeModal = () => {
    setIsModalOpen(false);
  };


  return (
    <>
      <div className="elements">
        {
          elements.map((item, index) => {
            return (
              <div key={index}>
                <div className="element" onClick={openModal}>
                  <img
                    alt="product-icon"
                    src={productIcon}
                    style={{ width: "200px", height: "200px", margin: "10px auto" }}
                  />
                  <div>
                    <span>$200</span>
                    <h3>{item.name} </h3>
                    <span>{item.description} </span>
                  </div>
                </div>
                <Modal
                  isOpen={isModalOpen}
                  closeModal={closeModal}
                  modalData={selectedModalData}
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



