-- Write your PostgreSQL query statement below
SELECT w1.id as Id
FROM Weather w1
WHERE w1.temperature > (SELECT w2.temperature
                          FROM Weather w2
                         WHERE w2.recordDate = w1.recordDate - 1);