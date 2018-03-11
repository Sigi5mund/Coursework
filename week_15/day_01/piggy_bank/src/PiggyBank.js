import React from 'react';

class PiggyBank extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      total: 0

    }

    this.deposit = this.deposit.bind(this);
    this.withdraw =this.withdraw.bind(this);
    this.depositAmount = this.depositAmount.bind(this);
  }

  deposit(){
    this.setState(prevState => {
      return {total: prevState.total + this.state.depositAmount}
    });
  }

  withdraw(){
    this.setState(prevState => {
      return {total: prevState.total - 1}
    });
  }





  render() {
    return (
      <div className="bank-box">
        <h1>{this.props.title}</h1>
        <p> Hello World! I am a Piggy Bank. </p>
        <p> I contain £{this.state.total}</p>
        <button onClick={this.deposit}>Deposit</button>
        <button onClick={this.withdraw}>Withdraw</button>

      </div>
    );
  }
}

export default PiggyBank;
