import React, { Component } from 'react';

class Login extends Component {
  constructor(props) {
    super(props)

    this.state = {
       
        email: '',
        pass:''
    }
    //this.changeFirstNameHandler = this.changeFirstNameHandler.bind(this);
    //this.changeLastNameHandler = this.changeLastNameHandler.bind(this);   
  }
  formSubmitHandler=event=>{
    event.preventDefault()
    console.log(this.state);
    this.props.history.push('/services');
  }
changeEmailHandler=(event)=>{
  this.setState({email:event.target.value});
}

changePassHandler=(event)=>{
  this.setState({pass: event.target.value});
}

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
                           <h3 className="text-center">Log In</h3>
                           <div className = "card-body">
                               <form onSubmit={this.formSubmitHandler}>
                                   <div className = "form-group">
                                       <label> Username: </label>
                                       <input placeholder="Enter email as username" name="email" className="form-control" 
                                           value={this.state.emailId} onChange={this.changeEmailHandler}/>
                                   </div>

                                   <div className = "form-group">
                                       <label> Password: </label>
                                       <input placeholder="Enter Password" type="password" name="pass" className="form-control" 
                                           value={this.state.pass} onChange={this.changePassHandler}/>
                                   </div>

                                   <button className="btn btn-success" onClick={this.updateEmployee}>Log In</button>
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

export default Login;