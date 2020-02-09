 df2<-Data_Sheet1$score2
 std2<-sqrt(sum((df2-mean(df2))^2/(length(df2)-1)))
y<-dnorm(df2,mean(df2),std2)

 plot(df2,y,col='brown',main='Test 2',xlab='scores',ylab='probability')
 png(file='test2.png')
 dev.off()

 df1<-Data_Sheet1$score1

 std1<-sqrt(sum((df1-mean(df1))^2/(length(df1)-1)))
 y<-dnorm(df1,mean(df1),std1)
 plot(df1,y,col='brown',main='Test 1',xlab='scores',ylab='probability')
 png(file='test1.png')
 dev.off()

 df3<-Data_Sheet1$score3
 std3<-sqrt(sum((df3-mean(df3))^2/(length(df3)-1)))
y<-dnorm(df3,mean(df3),std3)
plot(df3,y,col='brown',main='Test 3',xlab='scores',ylab='probability')

df4<-Data_Sheet1$score4
 std4<-sqrt(sum((df4-mean(df4))^2/(length(df4)-1)))
 y<-dnorm(df4,mean(df4),std4)
plot(df4,y,col='brown',main='Test 4',xlab='scores',ylab='probability')


 df5<-Data_Sheet1$score5

 std5<-sqrt(sum((df5-mean(df5))^2/(length(df5)-1)))
 y<-dnorm(df5,mean(df5),std5)
 plot(df5,y,col='brown',main='Test 5',xlab='scores',ylab='probability')


 df6<-Data_Sheet1$score6

 std6<-sqrt(sum((df6-mean(df6))^2/(length(df6)-1)))
 y<-dnorm(df6,mean(df6),std6)
 plot(df6,y,col='brown',main='Test 6',xlab='scores',ylab='probability')

 df7<-Data_Sheet1$score7
 std7<-sqrt(sum((df7-mean(df7))^2/(length(df7)-1)))
y<-dnorm(df7,mean(df7),std7)
plot(df7,y,col='brown',main='Test 7',xlab='scores',ylab='probability')

df8<-Data_Sheet1$score8

 std8<-sqrt(sum((df8-mean(df8))^2/(length(df8)-1)))
 y<-dnorm(df8,mean(df8),std8)
 plot(df8,y,col='brown',main='Test 8',xlab='scores',ylab='probability')

df9<-Data_Sheet1$score9

std9<-sqrt(sum((df9-mean(df9))^2/(length(df9)-1)))
y<-dnorm(df9,mean(df9),std9)
plot(df9,y,col='brown',main='Test 9',xlab='scores',ylab='probability')
