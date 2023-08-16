import axios from "axios";
import { Buffer } from "buffer";

export const validateUser = async (username, password) => {
  return new Promise((resolve, reject) => {
    // CONFIGURACIÓN ANTERIOR DE USUARIO DE SPRING SECURITY
    //const userBasic = "User";
    //const passwordBasic = "f7c73c3b-322c-4568-951d-c90b9f5a4cbe";

    const userBasic = "henny";
    const passwordBasic = "1234";

    const token = Buffer.from(`${userBasic}:${passwordBasic}`).toString(
      "base64"
    );
    const authHeader = `Basic ${token}`;

    const data = {
      email: username,
      password: password,
    };

    console.log(authHeader);
    console.log(data);

    return axios
      .post("http://localhost:8080/publico/authenticate", data, {
        headers: {
          Authorization: authHeader,
          "Content-Type": "application/json",
        },
      })
      .then((response) => {
        const token = response.data.jwtToken;
        sessionStorage.setItem("token", token);
        sessionStorage.setItem(
          "user-credentials",
          JSON.parse(atob(token.split(".")[1])).sub
        );
        console.log(token, " - email: ", sessionStorage.getItem("email"));
        resolve(response.status);
      })
      .catch((err) => {
        reject(err);
      });
  });
};
