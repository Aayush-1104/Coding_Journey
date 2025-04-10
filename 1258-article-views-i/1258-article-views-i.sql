# Write your MySQL query statement below
Select distinct author_id as id from Views where author_id=viewer_id order by id;
-- also we can write order by author_id/viewer_id also
-- gpt
-- SELECT DISTINCT author_id AS id
-- FROM Views
-- WHERE author_id = viewer_id
-- ORDER BY id;