import React, { Component, Fragment } from 'react';
import GroundService from '../../services/GroundService';
import { Link } from 'react-router-dom';

class GroundBooking extends Component {
    constructor(props) {
        super(props)

        this.state = {
            newground:[]
        }
        this.onTimeChange=this.onTimeChange.bind(this);
        this.time=React.createRef();
        
    }
    onTimeChange(time,index){
       this.state.newground[index]["bookingTime"]=time;
       this.setState({...this.state})
       console.log(time);
       console.log(index);
      
    }

    bookNowHandler=(ground,index)=>{
        console.log(ground);
        if(this.state.newground[index].isBooking)
        {
              window.alert("Ground is booked:"+this.state.newground[index]["bookingTime"]);
              this.state.newground[index]["isBooking"]=false; 
              this.setState({...this.state})
        }
        else{
            this.state.newground[index]["isBooking"]=true;
            this.setState({...this.state})
        }
        
    }
    componentDidMount(){
        GroundService.getGrounds().then((res) => {
            this.setState({ newground: res.data});
        });
    }

    render() {

        return (
            <div>
                 <h2 className="text-center">Sports Grounds</h2>
                 
                 <br></br>
                <div className = "row" style={{justifyContent: "center"}}>
                    {
                        this.state.newground.map((newground,index)=>{
                            return(
                                <Fragment>
                                   <div  key = {newground.id} className="card" style={{width: "18rem",margin:"20px"}}>
                                    <img height="150px" src={`/images/${newground.id}.jpg`} alt={newground.id}/>
                                    <div className="card-body">
                                    <h5 className="card-title">{newground.groundname}</h5>
                                    <div className="card-text">{newground.groundtype}</div>
                                    <div className="card-text">{newground.location}</div>
                                    <div className="card-text">{newground.sports}</div>
                                    <div className="card-text">{newground.contact}</div>
                                    <div className="card-text">{newground.rating}</div>
                                    {
                                        newground.isBooking&&
                                        <div>
                                        
                                                <select style={{width:"100%"}} className="form-select"  onChange={(e)=>{this.onTimeChange(e.target.value,index)}}>
                                                <option value="9:00-10:00">9:00-10:00</option>
                                                <option value="10:00-11:00">10:00-11:00</option>
                                                <option value="11:00-12:00">11:00-12:00</option>
                                                <option value="2:00-3:00">2:00-3:00</option>
                                                <option value="3:00-4:00">3:00-4:00</option>
                                                <option value="4:00-5:00">4:00-5:00</option>
                                                <option value="5:00-6:00">5:00-6:00</option>
                                                <option value="7:00-8:00">7:00-8:00</option>
                                                </select>
                                                
                                            </div>
                                    }
                                    
                                   <a href="#" onClick={this.bookNowHandler.bind(this,newground,index)} className="btn btn-primary  mt-2" style={{width:"100%"}}>{newground.isBooking?"Book Now":"Book"}</a>
                                    </div>
                                    </div> 
                                </Fragment>
                            )
                        })
                    }
               
                </div>
                 <div className = "row">
                        {/* <table className = "table table-striped table-bordered">

                            <thead>
                                <tr>
                                    <th></th>
                                    <th >Ground Name</th>
                                    <th>Ground Type</th>                                   
                                    <th>Location</th>
                                    <th>Sports</th>
                                    <th>Contact No</th>
                                    <th>Rating</th>
                                    <th>Time Slots</th>
                                    <th>Book Now</th>
                                </tr>
                            </thead>
                            <tbody>
                                {
                                    this.state.newground.map(
                                        newground => 
                                        <tr key = {newground.id}>
                                            <td></td>
                                             <td> { newground.groundname} </td>   
                                             <td> {newground.groundtype}</td>
                                             <td> {newground.location}</td>
                                             <td> {newground.sports}</td>
                                             <td> {newground.contact}</td>
                                             <td> {newground.rating}</td>
                                             <td> 
                                             <label for="time"></label>

                                                <select name="time" id="time">
                                                <option value="">9:00-10:00</option>
                                                <option value="">10:00-11:00</option>
                                                <option value="">11:00-12:00</option>
                                                <option value="">2:00-3:00</option>
                                                <option value="">3:00-4:00</option>
                                                <option value="">4:00-5:00</option>
                                                <option value="">5:00-6:00</option>
                                                <option value="">7:00-8:00</option>
                                                </select>

                                             </td>
                                             
                                             <td>
                                                 {}

                                                <Link to='/booked'>
                                                    <button className="btn btn-info">Book Now</button>

                                                </Link>
                                             </td>
                                        </tr>
                                    )
                                }
                            </tbody>
                        </table> */}

                 </div>

            </div>
        );
    }
}

export default GroundBooking;