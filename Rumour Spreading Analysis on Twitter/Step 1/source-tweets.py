
from pymongo import MongoClient
import json
from pprint import pprint

client = MongoClient('localhost', 27017)
db = client['test']
Collection = db['sourcetweets']
print("connect")

# insert source tweet

#580319078155468800
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580319078155468800\source-tweets\580319078155468800.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580319184652890113
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580319184652890113\source-tweets\580319184652890113.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580320684305416192
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580320684305416192\source-tweets\580320684305416192.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580321156508577792
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580321156508577792\source-tweets\580321156508577792.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580322453928431617
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580322453928431617\source-tweets\580322453928431617.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580323060533764097
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580323060533764097\source-tweets\580323060533764097.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580324027715063808
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580324027715063808\source-tweets\580324027715063808.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580325090367315968
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580325090367315968\source-tweets\580325090367315968.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580326222107951104
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580326222107951104\source-tweets\580326222107951104.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580331561398108160
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580331561398108160\source-tweets\580331561398108160.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580332109782466561
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580332109782466561\source-tweets\580332109782466561.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580333763512705025
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580333763512705025\source-tweets\580333763512705025.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580333909008871424
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580333909008871424\source-tweets\580333909008871424.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580339547269144576
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580339547269144576\source-tweets\580339547269144576.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580339825649291264
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580339825649291264\source-tweets\580339825649291264.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580340476949086208
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580340476949086208\source-tweets\580340476949086208.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580348081100734464
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580348081100734464\source-tweets\580348081100734464.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580360165540642816
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580360165540642816\source-tweets\580360165540642816.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580371845997682688
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580371845997682688\source-tweets\580371845997682688.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#580882341880446977
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\580882341880446977\source-tweets\580882341880446977.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581047170637381632
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\581047170637381632\source-tweets\581047170637381632.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581063377226637312
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\581063377226637312\source-tweets\581063377226637312.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581293286268129280
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\581293286268129280\source-tweets\581293286268129280.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581386094337474560
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\581386094337474560\source-tweets\581386094337474560.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")

#581473088249958400
with open(r'C:\Users\ADMIN\Downloads\germanwings-crash\581473088249958400\source-tweets\581473088249958400.json') as file:
    f = json.load(file)
if isinstance(f, list):
    Collection.insert_many(f)  
    print("many")
else:
    Collection.insert_one(f)
    print("one")


