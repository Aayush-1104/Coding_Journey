WITH RECURSIVE base AS (
  SELECT
      user_id, name, mail,
      LEFT(mail, CHAR_LENGTH(mail) - 13) AS prefix
  FROM Users
  WHERE RIGHT(mail, 13) = BINARY '@leetcode.com'            -- case-sensitive
    AND (CHAR_LENGTH(mail) - CHAR_LENGTH(REPLACE(mail,'@',''))) = 1
),
chars AS (
  SELECT
      user_id, name, mail, prefix,
      1 AS pos,
      SUBSTRING(prefix, 1, 1) AS ch,
      CHAR_LENGTH(prefix) AS len
  FROM base
  WHERE (LEFT(prefix,1) BETWEEN 'A' AND 'Z' OR LEFT(prefix,1) BETWEEN 'a' AND 'z')

  UNION ALL

  SELECT
      user_id, name, mail, prefix,
      pos + 1,
      SUBSTRING(prefix, pos + 1, 1),
      len
  FROM chars
  WHERE pos < len
)
SELECT user_id, name, mail
FROM chars
GROUP BY user_id, name, mail, prefix
HAVING SUM(
  CASE
    WHEN (ch BETWEEN 'A' AND 'Z')
      OR (ch BETWEEN 'a' AND 'z')
      OR (ch BETWEEN '0' AND '9')
      OR ch IN ('_', '-', '.')
    THEN 0 ELSE 1
  END
) = 0;

