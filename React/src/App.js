import React from 'react';
import Navbar from './components/Navbar';
import './App.css';
import Home from './components/pages/Home';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import Services from './components/pages/Services';
import Login from './components/pages/Login';
import Challenger from './components/pages/Challenger';
import SignUp from './components/pages/SignUp';
import TeammateFinder from './components/pages/TeammateFinder';
import GroundBooking from './components/pages/GroundBooking';
import ViewPlayerFinder from './components/pages/ViewPlayerFinder';
import SuccessfullyBooked from './components/pages/SuccessfullyBooked';
import SuccessfullyChallengeAccepted from './components/pages/SuccessfullyChallengeAccepted';
import SuccessConnect from './components/pages/SuccessConnect';

function App() {
  return (
    <>
      <Router>
        <Navbar />
        <Switch>
          <Route path='/' exact component={Home} />
          <Route path='/services' component={Services} />   
          <Route path='/sign-up' component={SignUp} />
          <Route path='/login' component={Login}/>
          <Route path='/home' exact component={Home} />
          <Route path='/challenger' component={Challenger}/>
          <Route path='/teamfinder' component={TeammateFinder}/>
          <Route path='/groundbooking' component={GroundBooking}/>

          <Route path='/view-playerFinder/:id' component={ViewPlayerFinder}/>
          <Route path='/booked' component={SuccessfullyBooked}/>
          <Route path='/challenge-accepted' component={SuccessfullyChallengeAccepted}/>
          <Route path='/connect' component={SuccessConnect}/>
        </Switch>
      </Router>
    </>
  );
}

export default App;
