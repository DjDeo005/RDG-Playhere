import axios from 'axios'

const USER_REST_API_URL = "http://localhost:8080/auth/signup";

class UserService{

    createUser(user){
        return axios.post(USER_REST_API_URL, user);
    }

}

export default new UserService();