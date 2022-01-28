import React, { Component } from 'react';
import UserService from '../../services/UserService';

class SignUp extends Component {
  constructor(props) {
    super(props)

    this.state = {
        id: this.props.match.params.id,
        firstName: '',
        lastName: '',
        email: '',
        mobile:'',
        role:'user',
        pass:''
    }
    
    this.changeEmailHandler=this.changeEmailHandler.bind(this);
    this.changeFirstNameHandler=this.changeFirstNameHandler.bind(this);
    this.changeLastNameHandler=this.changeLastNameHandler.bind(this);
    this.changeMobileHandler=this.changeMobileHandler.bind(this);
    this.changePassHandler=this.changePassHandler.bind(this);
    // this.changeOwnerRoleHandler=this.changeOwnerRoleHandler(this);

}


saveUser=(u)=>{
  u.preventDefault();
  let user = {email: this.state.email,firstname:this.state.firstName,lastname:this.state.lastName,mobile:this.state.mobile,role:this.state.role,pass:this.state.pass};
  console.log('User => ' + JSON.stringify(user));

  UserService.createUser(user).then(res => {
      this.props.history.push('/');
  })

}

    changeFirstNameHandler= (event) => {
      this.setState({firstName: event.target.value});
    }

    changeLastNameHandler= (event) => {
      this.setState({lastName: event.target.value});
    }

    changeEmailHandler= (event) => {
      this.setState({email: event.target.value});
    }

    changeMobileHandler=(event)=>{
      this.setState({mobile: event.target.value});
    }

    changePassHandler=(event)=>{
      this.setState({pass: event.target.value});
    }

    // changeOwnerRoleHandler=(event)=>{
    //   this.setState{(role:event.target.value)};
    // }

    cancel(){
      this.props.history.push('/');
    }




  render() {
    return (
      <div>
           <br></br>
                   <div className = "container">
                        <div className = "row">
                            <div className = "card col-md-6 offset-md-3 offset-md-3">
                                <h3 className="text-center">Sign Up Form</h3>
                                <div className = "card-body">
                                    <form>
                                        <div className = "form-group">
                                            <label> First Name: </label>
                                            <input placeholder="First Name" name="firstName" className="form-control" 
                                                value={this.state.firstName} onChange={this.changeFirstNameHandler}/>
                                        </div>
                                        <div className = "form-group">
                                            <label> Last Name: </label>
                                            <input placeholder="Last Name" name="lastName" className="form-control" 
                                                value={this.state.lastName} onChange={this.changeLastNameHandler}/>
                                        </div>

                                        <div className = "form-group">
                                            <label> Mobile: </label>
                                            <input placeholder="Enter Mobile No" name="mobile" className="form-control" 
                                                value={this.state.mobile} onChange={this.changeMobileHandler}/>
                                        </div>

                                        <div className = "form-group">
                                            <label> Email Id: </label>
                                            <input placeholder="Email Address" name="email" className="form-control" 
                                                value={this.state.emailId} onChange={this.changeEmailHandler}/>
                                        </div>

                                        <div className = "form-group">
                                            <label> Password: </label>
                                            <input placeholder="Enter Password" name="pass" className="form-control" 
                                                value={this.state.pass} onChange={this.changePassHandler}/>
                                        </div>

                                        {/* <div className = "form-group">
                                            <label> Select Role: </label>
                                            <div  >
                                            <input type="radio" name="Ownerrole" className="btn btn-primary active" 
                                                value="Owner" onChange={this.changeOwnerRoleHandler} />Owner
                                             </div>
                                            <div >  
                                            <input type="radio" name="role" className="btn btn-primary active" 
                                                value="user" onChange={this.changeUserRoleHandler}checked/>User 
                                           </div>
                                        </div> */}

                                     

                                        <button className="btn btn-success" onClick={this.saveUser}>Sign Up</button>
                                        <button className="btn btn-danger" onClick={this.cancel.bind(this)} style={{marginLeft: "10px"}}>Cancel</button>
                                    </form>
                                </div>
                            </div>
                        </div>

                   </div> 
      </div>
    );
  }
}

export default SignUp;