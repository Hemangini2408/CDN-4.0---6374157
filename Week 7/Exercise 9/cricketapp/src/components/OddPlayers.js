import React from "react";

export default function OddPlayers(props) {
  const [first, , third, , , fifth] = props.IndianTeam;

  return (
    <div>
      <li>First: {first}</li>
      <li>Third: {third}</li>
      <li>Fifth: {fifth}</li>
    </div>
  );
}
