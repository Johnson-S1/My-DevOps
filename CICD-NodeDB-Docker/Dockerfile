FROM node:alpine
WORKDIR /var/lib/node
COPY . .
RUN npm install
RUN npm install mongodb
RUN npm link
ENTRYPOINT ["collect-user"] 

