
from pymongo import MongoClient
import json
from pprint import pprint

client = MongoClient('localhost', 27017)
db = client['Bigdata']
Collection = db['retweets']
print("connect")

# insert retweet

#580319078155468800
with open(r'E:\ProjectBIG\germanwings-crash\580319078155468800\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580319184652890113
with open(r'E:\ProjectBIG\germanwings-crash\580319184652890113\retweets.json') as file:
     f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580320684305416192
with open(r'E:\ProjectBIG\germanwings-crash\580320684305416192\retweets.json') as file:
     f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580321156508577792
with open(r'E:\ProjectBIG\germanwings-crash\580321156508577792\retweets.json') as file:
      f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580322453928431617
with open(r'E:\ProjectBIG\germanwings-crash\580322453928431617\retweets.json') as file:
     f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580323060533764097
with open(r'E:\ProjectBIG\germanwings-crash\580323060533764097\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580324027715063808
with open(r'E:\ProjectBIG\germanwings-crash\580324027715063808\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580325090367315968
with open(r'E:\ProjectBIG\germanwings-crash\580325090367315968\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580326222107951104
with open(r'E:\ProjectBIG\germanwings-crash\580326222107951104\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580331561398108160
with open(r'E:\ProjectBIG\germanwings-crash\580331561398108160\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580332109782466561
with open(r'E:\ProjectBIG\germanwings-crash\580332109782466561\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580333763512705025
with open(r'E:\ProjectBIG\germanwings-crash\580333763512705025\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580333909008871424
with open(r'E:\ProjectBIG\germanwings-crash\580333909008871424\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580339547269144576
with open(r'E:\ProjectBIG\germanwings-crash\580339547269144576\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580339825649291264
with open(r'E:\ProjectBIG\germanwings-crash\580339825649291264\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580340476949086208
with open(r'E:\ProjectBIG\germanwings-crash\580340476949086208\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580348081100734464
with open(r'E:\ProjectBIG\germanwings-crash\580348081100734464\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580360165540642816
with open(r'E:\ProjectBIG\germanwings-crash\580360165540642816\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580371845997682688
with open(r'E:\ProjectBIG\germanwings-crash\580371845997682688\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580882341880446977
with open(r'E:\ProjectBIG\germanwings-crash\580882341880446977\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581047170637381632
with open(r'E:\ProjectBIG\germanwings-crash\581047170637381632\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581063377226637312
with open(r'E:\ProjectBIG\germanwings-crash\581063377226637312\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581293286268129280
with open(r'E:\ProjectBIG\germanwings-crash\581293286268129280\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581386094337474560
with open(r'E:\ProjectBIG\germanwings-crash\581386094337474560\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581473088249958400
with open(r'E:\ProjectBIG\germanwings-crash\581473088249958400\retweets.json') as file:
    f = [json.loads(line) for line in file]
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")


