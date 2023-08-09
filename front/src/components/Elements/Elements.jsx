import '../../Styles/Elements.css'
import productIcon from './assets/error.svg'

const Elements = () => {

  const elements = [
    {

    }, {
    }, {
    }, {
    }, {
    }, {
    }, {
    }, {
    }, {
    }, {
    }, {
    }, {
    }, {
    }, {
    }
  ]


  return (
    <>
      <div className="elements">
        {
          elements.map((item, index) => {
            return (
              <div className="element" key={index}>
                <img
                  alt="product-icon"
                  src={productIcon}
                  style={{ width: "200px", height: "200px", margin: "10px auto" }}
                />
                <div>
                  <span>$200</span>
                  <h3>zapatos</h3>
                  <span>zapatos baratos</span>
                </div>
              </div>
            )
          })
        }
      </div>
    </>
  )
}



export default Elements



