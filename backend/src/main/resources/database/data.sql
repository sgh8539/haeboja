INSERT INTO CUSTOMER VALUES
('abcd', '홍길동', '동에번쩍서에번쩍', '010-1234-5678'),
('efgh', '고길동', '내친구는둘리', '010-9876-5432');

INSERT INTO HOUSE VALUES
(1, 'motel', '', '잠실 HL Hotel', '서울 송파구 방이동 38-2', 9.3, '★그랜드오픈 ※ 리모델링완료★', '', '객실문에 부착된 여기어때 혜택마크를 찾아 QR코드로 혜택받으세요.'),
(2, 'motel', '', '잠실 첼로', '서울 송파구 방이동 37-3', 9.2, '익일체크아웃시간초과시추가요금발생!!스탠다드객실타입(랜덤지정)!!', '', '요금할인');

INSERT INTO ROOM VALUES
(1, 1, '다락(전기장판, No pc / 도보전용객실)', 2, 22, 4, 20000, 20, 13, 38000, '', '', 10),
(2, 1, 'NETFLIX_잠실 제일큰 스탠다드룸(전기장판)', 2, 23, 6, 25000, 18, 14, 40000, '', '', 10),
(3, 1, '디럭스 트윈(전기장판)', 2, 0, 0, 0, 18, 14, 50000, '', '', 10),
(4, 1, 'NETFLIX_잠실 제일큰 vvip룸(전기장판)', 2, 23, 6, 35000, 18, 14, 60000, '', '', 10),
(5, 2, '스탠다드 더블A', 2, 23, 4, 30000, 22, 13, 60000, '', '', 10),
(6, 2, '스탠다드 더블B', 2, 23, 4, 30000, 21, 13, 70000, '', '', 10),
(7, 2, '디럭스더블 A, B', 2, 23, 4, 35000, 21, 13, 75000, '', '', 10),
(8, 2, '스위트 더블 A, B, C', 2, 23, 4, 40000, 21, 13, 90000, '', '', 10);