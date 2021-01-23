# Serverless Example

## Description

This is a sample code for *Serverless* framework. This project will create a SNS queue and a lambda function. Lambda function will be invoked whenever there's a new message in the SNS topic.

## Commands

#### To Deploy serverless
```
npm install
export AWS_ACCESS_KEY_ID=test
export AWS_SECRET_ACCESS_KEY=test
serverless deploy --stage local
```


#### To invoke the lambda function we have to publish a message in SNS.
```
awslocal sns publish \
    --topic-arn "arn:aws:sns:us-east-1:000000000000:dispatch" \
    --message file://message.txt
```

You can check the cloudwatch logs using the command below.

#### To retrive the log group name using:
```
awslocal logs describe-log-groups

```

#### To retrive the streamname:
```
awslocal logs describe-log-streams --log-group-name <group-name>
```

#### To get the logs:
```
awslocal logs get-log-events --log-group-name <group-name> --log-stream-name "<stream-name>" --limit 5
```