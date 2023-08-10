import axios from "axios";

const fetchData = async (method, fetchUrl, setElements) => {
  const options = {
    method: `${method}`,
    url: `http://localhost:8080${fetchUrl}`,
    // ,
    // data: {
    //     "username": "johndoe",
    //     "password": "mypass123"
    // }
    headers: {
      "Content-Type": "application/json",
    },
  };

  try {
    const response = await axios.request(options);
    setElements(response.data);
    console.log(response.data);
  } catch (error) {
    console.error(error);
  }
};

export default fetchData
