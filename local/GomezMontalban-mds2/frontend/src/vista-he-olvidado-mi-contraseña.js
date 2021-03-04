import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaHeOlvidadoMiContrase�a extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing"></vaadin-vertical-layout>
</vaadin-vertical-layout>
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-he-olvidado-mi-contrase�a';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaHeOlvidadoMiContrase�a.is, VistaHeOlvidadoMiContrase�a);
