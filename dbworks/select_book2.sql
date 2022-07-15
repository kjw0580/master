-- 집계 함수 : SUM, COUNT, AVG
-- 주문 테이블 검색
-- 고객이 주문한 도서의 총 판매액을 구하시오
SELECT SUM(saleprice) AS 총매출
FROM orders;

-- '김연아' 고객이 주문한 도서의 총 판매액을 구하시오
SELECT SUM(saleprice) AS 총매출
FROM orders
WHERE custid = 2;

-- 고객이 주문한 도서의 총 판매액, 평균값을 구하시오.
SELECT SUM(saleprice) AS Total,
       AVG(saleprice) AS Average
FROM orders;

-- 마당 서점의 도서 판매 건수를 구하시오.
SELECT COUNT(*) AS 총판매건수
FROM orders;

-- 고객별로 주문한 도서의 총 수량과 판매액을 구하시오.
-- 그룹 : GROUP BY
SELECT COUNT(*) 도서수량, SUM(saleprice) 총액
FROM orders;

SELECT custid, COUNT(*) 도서수량, SUM(saleprice) 총액
FROM orders
GROUP BY custid;

--HAVING 절 : GROUP BY 질의 결과 나타나는 그룹을 제한하는 역할
--가격이 8000원 이상인 도서를 구매한 고객에 대하여 고객별 주문 도서의 총 수량을 구하시오.
SELECT custid, COUNT(*) 도서수량 
FROM orders WHERE saleprice >= 8000 GROUP BY custid HAVING COUNT(*) >=2;

--조인 : 1개 이사으이 테이블을 연결
--고객과 고객의 주문에 관한 데이터를 모두 검색하시오
SELECT * FROM customer, orders WHERE customer.custid = orders.custid;

--고객의 이름과 고객이 주문한 도서의 판매가격을 검색하시오
SELECT customer.name, orders.saleprice FROM customer, orders WHERE customer.custid = orders.custid;

--안산 고객의 주문내역을 검색하시오
SELECT * FROM customer, orders WHERE customer.custid = orders.custid AND customer.name = '안산';

--고객별로 주문한 모든 도서의 총 판매액을 구하고, 고객별로 정렬
SELECT customer.name, SUM(saleprice) AS 총판매액 FROM customer, orders WHERE customer.custid = orders.custid
GROUP BY customer.name ORDER BY customer.name;

--고객의 이름과 주문한 도서의 이름을 검색하시오
SELECT customer.name, book.bookname, orders.saleprice FROM customer, orders, book WHERE customer.custid = orders.custid AND book.bookid = orders.bookid;

--외부 조인(outer join) : 조인 조건이 정확히 일치하지 않아도 모든 결과를 출력
--도서를 구매하지 않은 고객을 포함하여 고객의 이름과 고객이 주문한 도서의 판매 가격을 구하시오.
SELECT * FROM customer LEFT OUTER JOIN orders ON customer.custid = orders.custid;

