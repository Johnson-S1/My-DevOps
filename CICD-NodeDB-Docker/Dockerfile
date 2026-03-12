FROM node:alpine
WORKDIR /var/lib/node
COPY . .
RUN npm install
RUN npm link
ENTRYPOINT ["collect-user"] 

