echo "performing clean"
call mvn clean
echo "performing package"
call mvn package
java -jar target/AccountsModule-1.0-SNAPSHOT.jar