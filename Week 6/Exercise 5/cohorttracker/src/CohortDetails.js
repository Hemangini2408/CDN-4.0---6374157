import React from 'react';
import styles from './CohortDetails.module.css';

const CohortDetails = ({ data }) => {
  return (
    <div className={styles.box}>
      <h3
        className={
          data.status.toLowerCase() === 'ongoing'
            ? styles.ongoing
            : styles.other
        }
      >
        {data.id} - {data.title}
      </h3>
      <dl>
        <dt>Started On</dt>
        <dd>{data.startDate}</dd>

        <dt>Current Status</dt>
        <dd>{data.status}</dd>

        <dt>Coach</dt>
        <dd>{data.coach}</dd>

        <dt>Trainer</dt>
        <dd>{data.trainer}</dd>
      </dl>
    </div>
  );
};

export default CohortDetails;