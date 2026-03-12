FROM node:alpine
WORKDIR /var/lib/node
COPY . .
RUN npm install ./package.json
RUN npm link
ENTRYPOINT ["collect-user"] 

