call apoc.load.json("file:/retweets.json")
YIELD value
UNWIND value as R
merge (r:Userretweet {id:R.user.id}) 
merge (p:Userpost{id:R.retweeted_status.user.id})
merge (w:Post {id:R.retweeted_status.id_str})
merge (r)-[rl:IS_RETWEET]->(w)
merge (p)-[rl2:IS_POSTRETWEET]->(w)
return r,p,w
limit 50
