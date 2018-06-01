# springboot-data-jpa-h2

# Spring Data

Spring Data JPA'daki soyutluğu daha da öteye taşıyarak Repository interface i ve bundan extend edilen birçok interface ile çoğu veritabanına
kullanıma hazır metodlar ile sık kullanılan sorgulardan, model fieldlarına göre filtreleme yapılabilen özel metodlara kadar birçok kolaylık sağlamıştır. 

Spring Data ile desteklenen bütün veritabanlarında Employee'nin Name field ı aynı metodla çağırılabilir.

```sh
	  List<Employee> findByName(String name);
```
