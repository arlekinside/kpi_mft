import Header from "./Header";
import Content from "./Content";
import Params from "../../Params";
import React from "react";

function Page(props: { children: any, unauthorized?: boolean, width?: string}) {

    return (
        <div style={{display: "flex", flexDirection: "column", justifyContent: 'space-between', alignItems: 'center'}}>
            {props.unauthorized ?
                <h1 style={{color: Params.colors.lightText, margin: 0, fontVariant: '', alignSelf: 'flex-start', paddingLeft: '20px'}}>{Params.labels.appName}</h1>:
                <Header/>
            }
            <Content width={props.width}>
                {props.children}
            </Content>
        </div>
    );
}

export default Page;