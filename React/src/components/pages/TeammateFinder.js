import React, { Component } from 'react';
import TeammateFinderService from '../../services/TeammateFinderService';

class TeammateFinder extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            id: this.props.match.params.id,
            availplayer:'',
            contactnum:'',
            contactperson:'',
            eventdate:'' ,
            eventtime:'',
            location:'',
            reqplayer:'',
            sports:''
        }
        
        this.changelocationHandler=this.changelocationHandler.bind(this);
        this.changesportsHandler=this.changesportsHandler.bind(this);
        this.changeReqplayerHandler=this.changeReqplayerHandler.bind(this);
        this.changeAvailablePlayersHandler=this.changeAvailablePlayersHandler.bind(this);
        this.changedateHandler=this.changedateHandler.bind(this);
        this.changetimeHandler=this.changetimeHandler.bind(this);
        this.changeContactPersonHandler=this.changeContactPersonHandler.bind(this);
        this.changeContactPersonMobileHandler=this.changeContactPersonMobileHandler.bind(this);
    }

    saveTeammateFinder=(s)=>{
        s.preventDefault();
        let teammatefinder = {id:"",availplayer:this.state.availplayer,contactnum:this.state.contactnum,contactperson:this.state.contactperson,eventdate:this.state.eventdate,eventtime:this.state.eventtime,location:this.state.location,reqplayer:this.state.reqplayer,sports:this.state.sports };
        console.log('team_finder => '+JSON.stringify(teammatefinder)); 

        TeammateFinderService.createTeammateFinder(teammatefinder).then(res=>{
            this.props.history.push('/services')
        })

    }

    changelocationHandler=(event)=>{
        this.setState({location: event.target.value});
    }

    changesportsHandler=(event)=>{
        this.setState({sports: event.target.value});
    }

    changeReqplayerHandler=(event)=>{
        this.setState({reqplayer: event.target.value});
    }

    changeAvailablePlayersHandler=(event)=>{
        this.setState({availplayer: event.target.value});
    }
    changetimeHandler=(event)=>{
        this.setState({eventtime:event.target.value});
    }
    
    changedateHandler=(event)=>{
        this.setState({eventdate:event.target.value});
    }

    changeContactPersonHandler=(event)=>{
        this.setState({contactperson:event.target.value});
    }

    changeContactPersonMobileHandler=(event)=>{
        this.setState({contactnum:event.target.value});
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
                            <h3 className="text-center">Teammate Finder</h3>
                            <div className = "card-body">
                                <form>
                                    <div className = "form-group">
                                        <label> Location: </label>
                                        <input placeholder="Enter Location" name="location" className="form-control" 
                                            value={this.state.location} onChange={this.changelocationHandler}/>
                                    </div>

                                    <div className = "form-group">
                                        <label> Sports: </label>
                                        <input placeholder="Enter Sports Name" name="sports" className="form-control" 
                                            value={this.state.sports} onChange={this.changesportsHandler}/>
                                    </div>

                                    <div className = "form-group">
                                        <label> Required Players: </label>
                                        <input placeholder="Enter required number of players"  name="reqplayer" className="form-control" 
                                            value={this.state.reqplayer} onChange={this.changeReqplayerHandler}/>
                                    </div>


                                    <div className = "form-group">
                                        <label> Available Players: </label>
                                        <input placeholder="Enter Available Players" name="availplayer" className="form-control" 
                                            value={this.state.availplayer} onChange={this.changeAvailablePlayersHandler}/>
                                    </div>

                                    <div className = "form-group">
                                        <label> Date: </label>
                                        <input placeholder="yyyy-mm-dd"  name="eventdate" className="form-control" 
                                            value={this.state.eventdate} onChange={this.changedateHandler}/>
                                    </div>

                                    <div className = "form-group">
                                        <label> Time: </label>
                                        <input  placeholder="hh:mm:ss" name="eventtime" className="form-control" 
                                            value={this.state.eventtime} onChange={this.changetimeHandler}/>
                                    </div>

                                    <div className = "form-group">
                                        <label> Contact Person: </label>
                                        <input placeholder="Enter Contact Person Name" name="contactperson" className="form-control" 
                                            value={this.state.contactperson} onChange={this.changeContactPersonHandler}/>
                                    </div>

                                    <div className = "form-group">
                                        <label> Contact Number: </label>
                                        <input placeholder="Enter Contact Person Mobile" name="contactnum" className="form-control" 
                                            value={this.state.contactnu} onChange={this.changeContactPersonMobileHandler}/>
                                    </div>
                                    

                                    <button className="btn btn-success" onClick={this.saveTeammateFinder}>Post</button>
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

export default TeammateFinder;