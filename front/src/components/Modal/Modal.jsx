import { useSpring, animated } from 'react-spring'; // Importa la librería de animaciones
import './Modal.css'

const Modal = ({ isOpen, closeModal, modalData }) => {
  const animation = useSpring({
    from: { transform: 'translateY(100%)', opacity: 0 },
    to: { transform: 'translateY(0)', opacity: 1 },
    config: { tension: 200, friction: 20 },
    // Cambia los valores de 'tension' y 'friction' para ajustar la animación
  });

  const agregarAlCarrito = () => {
    alert("producto agregado al carrito con éxito!")
  }

  return (
    <animated.div
      className={`modal ${isOpen ? 'open' : ''}`}
      style={animation}
    >
      <div className="modal-content">
        <h1>Información producto</h1>
        <h2>{modalData.name ?? "nombre producto" }</h2>
        <p>{modalData?.description ?? "descripción producto"}</p>
        {/* Otros elementos y datos relacionados */}
        <div className="buttons">
          <button className="modal-button green" onClick={() => {
            agregarAlCarrito()
            closeModal()
          }}>Agregar al carrito</button>
          <button className="modal-button gray" onClick={closeModal}>Cerrar</button>
        </div>
      </div>
    </animated.div>
  );
};

export default Modal;
