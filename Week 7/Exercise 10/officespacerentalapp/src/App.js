import React from "react";
import "./App.css";

function App() {

  const heading = "Office Space";

  const officeSpaces = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "https://uploads-ssl.webflow.com/5e1f1da7fa3d448bab479847/63e50dceef8527e6d71a05ed_AdobeStock_339067151.png"
    },
    {
      Name: "WeWork",
      Rent: 75000,
      Address: "Bangalore",
      Image: "https://assets-global.website-files.com/6442419dcf656a81da76b503/65ac7bcca32da2cb975b2f72_modern-office-with-skyline-zoom-background.jpg"
    },
    {
      Name: "SmartWorks",
      Rent: 60000,
      Address: "Mumbai",
      Image: "https://agile.org.uk/wp-content/uploads/2023/09/Office-Interior-Design.jpg"
    }
  ];

  return (
    <div className="App">
      <h1>Office Space, at Affordable Range</h1>
      <div className="card-container">
        {officeSpaces.map((item, index) => {
          const rentClass = item.Rent <= 60000 ? "textRed" : "textGreen";
          return (
            <div className="office-card" key={index}>
              <img
                src={item.Image}
                width="100%"
                height="200px"
                alt="Office Space"
                style={{ borderRadius: "8px", objectFit: "cover" }}
              />
              <h2>Name: {item.Name}</h2>
              <h3 className={rentClass}>Rent: Rs. {item.Rent}</h3>
              <h3>Address: {item.Address}</h3>
            </div>
          );
        })}
      </div>
    </div>
  );
}

export default App;
