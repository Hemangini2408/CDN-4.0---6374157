import React from 'react';
import CohortDetails from './CohortDetails';

const cohortList = [
  {
    id: 'INTADMDF10',
    title: '.NET FSD',
    startDate: '22-Feb-2022',
    status: 'Scheduled',
    coach: 'Aashtha',
    trainer: 'Jojo Jose'
  },
  {
    id: 'ADM21JF014',
    title: 'Java FSD',
    startDate: '10-Sep-2021',
    status: 'Ongoing',
    coach: 'Apoorv',
    trainer: 'Elisa Smith'
  },
  {
    id: 'CDBJF21025',
    title: 'Java FSD',
    startDate: '24-Dec-2021',
    status: 'Ongoing',
    coach: 'Aashtha',
    trainer: 'John Doe'
  }
];

const App = () => {
  return (
    <div>
      <h2>Cohorts Details</h2>
      {cohortList.map((cohort, index) => (
        <CohortDetails key={index} data={cohort} />
      ))}
    </div>
  );
};

export default App;
