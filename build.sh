repo_url=registry-vpc.cn-hangzhou.aliyuncs.com
namespace=dzy5639313

docker login --username=13666031483 --password=wym68689 $repo_url

p=eureka
docker build -t zyd-$p ./$p/
docker tag zyd-$p $repo_url/$namespace/zyd-$p
docker push $repo_url/$namespace/zyd-$p
docker rmi $repo_url/$namespace/zyd-$p

p=config
docker build -t zyd-$p ./$p/
docker tag zyd-$p $repo_url/$namespace/zyd-$p
docker push $repo_url/$namespace/zyd-$p
docker rmi $repo_url/$namespace/zyd-$p

p=gateway
docker build -t zyd-$p ./$p/
docker tag zyd-$p $repo_url/$namespace/zyd-$p
docker push $repo_url/$namespace/zyd-$p
docker rmi $repo_url/$namespace/zyd-$p

p=api
docker build -t zyd-$p ./$p/
docker tag zyd-$p $repo_url/$namespace/zyd-$p
docker push $repo_url/$namespace/zyd-$p
docker rmi $repo_url/$namespace/zyd-$p

docker logout $repo_url
