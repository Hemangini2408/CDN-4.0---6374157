import React from "react";

const ListofPlayers = ({ players }) => {
  return (
    <ul>
      {players.map((item, index) => (
        <li key={index}>
          Mr. {item.name} {item.score}
        </li>
      ))}
    </ul>
  );
};

export default ListofPlayers;
