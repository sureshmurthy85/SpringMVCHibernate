FROM maven:3.3-jdk-8-onbuild

git reset --hard HEAD
git clean -f
git pull

CMD ["mvn clean install"]