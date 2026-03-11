FROM nginx:alpine
WORKDIR "/usr/share/nginx/html/"
COPY . .
RUN apk update && apk add --no-cache vim curl
EXPOSE 80
ENV CONTAINER="nginx build"
CMD ["nginx","-g","daemon off;"]
 
