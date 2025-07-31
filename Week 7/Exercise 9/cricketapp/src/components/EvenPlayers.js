import React from "react";

export default function EvenPlayers(props) {
  const [, second, , fourth, , sixth] = props.IndianTeam;

  return (
    <div>
      <li>Second: {second}</li>
      <li>Fourth: {fourth}</li>
      <li>Sixth: {sixth}</li>
    </div>
  );
}
