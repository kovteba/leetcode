-- Write your PostgreSQL query statement below
SELECT t.tweet_id
  FROM Tweets t
 WHERE CHAR_LENGTH(t.content) > 15 