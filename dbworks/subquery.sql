--인라인 뷰 : FROM 부속 질의
--고객 번호가 2이하인 고객의 판매액을 검색하시오(고객이름과 고객별 판매액 출력)
SELECT cs.name, SUM(od.saleprice) AS total 
FROM (SELECT custid, name 
FROM customer 
WHERE custid <=2) cs,
orders od 
WHERE cs.custid = od.custid 
GROUP BY cs.name;