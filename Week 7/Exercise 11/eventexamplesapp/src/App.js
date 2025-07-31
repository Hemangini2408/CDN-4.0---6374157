import React, { Component } from 'react';
import './App.css';

class CurrencyConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      amount: '',
      currency: '',
      result: ''
    };
  }

  handleAmountChange = (e) => {
    this.setState({ amount: e.target.value });
  };

  handleCurrencyChange = (e) => {
    this.setState({ currency: e.target.value });
  };

  handleSubmit = (e) => {
    e.preventDefault();
    const { amount, currency } = this.state;
    const numericAmount = parseFloat(amount);

    if (currency.toLowerCase() === 'euro' && !isNaN(numericAmount)) {
      const converted = numericAmount / 90;
      this.setState({ result: `Converted Amount: €${converted.toFixed(2)}` });
    } else {
      this.setState({ result: 'Please enter a valid amount and currency (Euro).' });
    }
  };

  render() {
    const containerStyle = {
      textAlign: 'center',
      marginTop: '40px',
    };

    return (
      <div style={containerStyle}>
        <h2 style={{ color: 'green' }}>Currency Convertor!!!</h2>
        <form onSubmit={this.handleSubmit}>
          <label>
            Amount: <input type="text" value={this.state.amount} onChange={this.handleAmountChange} />
          </label>
          <br /><br />
          <label>
            Currency: <input type="text" value={this.state.currency} onChange={this.handleCurrencyChange} />
          </label>
          <br /><br />
          <button type="submit">Convert</button>
        </form>
        <h3>{this.state.result}</h3>
      </div>
    );
  }
}

class App extends Component {
  constructor() {
    super();
    this.state = {
      count: 0,
    };
  }

  increase = () => {
    this.setState(prev => ({ count: prev.count + 1 }), () => {
      alert('Hello');
    });
  };

  decrease = () => {
    this.setState(prev => ({ count: prev.count - 1 }));
  };

  sayWelcome = (message) => {
    alert(message);
  };

  onPress = (event) => {
    alert("I was clicked");
  };

  render() {
    const containerStyle = {
      textAlign: 'center',
      marginTop: '40px',
    };

    return (
      <div style={containerStyle}>
        <h1>React Event Handling Lab</h1>
        <p>Count: {this.state.count}</p>
        <button onClick={this.increase}>Increment</button> &nbsp;
        <button onClick={this.decrease}>Decrement</button> &nbsp;
        <button onClick={() => this.sayWelcome("Welcome")}>Say Welcome</button> &nbsp;
        <button onClick={this.onPress}>OnPress</button>

        <hr />

        {/* Currency Converter Component */}
        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
