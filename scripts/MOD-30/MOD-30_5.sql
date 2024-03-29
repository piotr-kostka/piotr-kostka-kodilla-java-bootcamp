CREATE VIEW BOOKS_AND_READERS AS
SELECT RD.READER_ID, RD.FIRSTNAME, RD.LASTNAME, BK.TITLE, RT.RENT_DATE, RT.RETURN_DATE
FROM READERS RD, BOOKS BK, RENTS RT
WHERE RT.BOOK_ID = BK.BOOK_ID
  AND RT.READER_ID = RD.READER_ID
ORDER BY RT.RENT_DATE;

SELECT * FROM BOOKS_AND_READERS
where RENT_DATE > DATE_SUB(CURDATE(), INTERVAL 30 DAY)
ORDER BY LASTNAME;

SHOW PROCESSLIST;
SET GLOBAL EVENT_SCHEDULER=ON;

USE kodilla_course;
CREATE EVENT UPDATE_VIPS
    ON SCHEDULE EVERY 1 MINUTE
    DO CALL UpdateVipLevels();

UPDATE READERS
    SET VIP_LEVEL = 'NOT SET';
SELECT * FROM readers;
