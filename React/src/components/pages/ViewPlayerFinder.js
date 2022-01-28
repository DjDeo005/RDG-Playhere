import React, { Component } from 'react';

class ViewPlayerFinder extends Component {
    constructor(props) {
        super(props)

        this.state = {
            id: this.props.match.params.id,
            team_finder: {}
        }
    }
    render() {
        return (
            <div>
            
            </div>
        );
    }
}

export default ViewPlayerFinder;