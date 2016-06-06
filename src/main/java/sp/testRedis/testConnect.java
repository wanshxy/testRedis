package sp.testRedis;

import redis.clients.jedis.Jedis;


public class testConnect {
       static String constr = "192.168.128.128" ;
       public static Jedis getRedis(){
    	   //指定端口和ip，网上的例子没指定，导致失败
            Jedis jedis = new Jedis(constr,6379) ;
          return jedis ;
      }
       public static void main(String[] args){
            Jedis j = testConnect. getRedis() ;
            System.out.println(j);
            String output ;
            j.set( "hello", "world" ) ;
            output = j.get( "hello") ;
            System. out.println(output) ;
      }
}