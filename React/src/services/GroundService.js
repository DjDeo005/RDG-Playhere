import axios from "axios";

const GROUND_BOOKING_REST_URL="http://localhost:8080/ground";

class GroundService{

    getGrounds(){
        return axios.get(GROUND_BOOKING_REST_URL+"/get");
    }

}
export default new GroundService();