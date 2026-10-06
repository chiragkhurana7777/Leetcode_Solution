select round(count(a.player_id)/(select count(distinct player_id) from activity),2) as fraction from
activity a join
(select player_id,min(event_date) as first_date 
from activity group by player_id ) first on
a.player_id=first.player_id
and a.event_date = date_add(first_date,interval 1 day);