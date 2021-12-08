-- yeu cau 1: Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất:
select * from subject
where subject.Credit >= All (select credit from subject);

-- Yeu cau 2: Hiển thị các thông tin môn học có điểm thi lớn nhất:
select * from subject
inner join mark on subject.SubId=mark.SubId 
where mark.Mark >= All (select mark from mark);

select * from mark;
select * from student;
-- Yêu cầu 3: Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select student.*, AVG(Mark) from student 
right join mark on student.StudentId=mark.StudentId
where student.StudentId=mark.StudentId
group by StudentId
order by avg(Mark) desc;

