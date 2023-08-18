import './Modal.css'
import icon from "../Elements/assets/error.svg"


const Modal = ({ isOpen, closeModal, data }) => {

  return (
    <div
      className={`modal ${isOpen ? 'open' : ''}`}
    >
      <div className="product-content-information">
        <div>
          <img 
          style={{width: "300px", height: "300px"}}
            src={icon}
          />
        </div>
        <div className="modal-content">
          <h1>Información producto</h1>
          <h2>{data.name}</h2>
          <>
            <h3>Descripción:</h3>
            <span> {data.cartDesc}</span>
          </>
          <>
            <h3>Precio:</h3>
            <span> {data.price}</span>
          </>
          <>
            <h3>Stock:</h3>
            <span> {data.stock}</span>
          </>
          <>
            <h3>Localización:</h3>
            <span> {data.location}</span>
          </>
          <>
            <h3>Descripción completa:</h3>
            <span className="descripcion"> {data.longDesc}</span>
          </>
          <div className="buttons">
            <button className="modal-button gray" onClick={closeModal}>Agregar al carrito</button>
            <button className="modal-button gray" onClick={closeModal}>Cerrar</button>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Modal;
