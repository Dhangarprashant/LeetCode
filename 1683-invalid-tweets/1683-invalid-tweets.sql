# Write your MySQL query statement below

# this is not correct becuase here length is counting bytes which is not correct ,we want count of characters
# SELECT tweet_id
# FROM Tweets
# WHERE LENGTH(content)>15;


# this is correct beacause here we are using char_length which count only characters

SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content)>15;