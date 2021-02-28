import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-datos-de-envio`
 *
 * VistaDatosDeEnvio element.
 *
 * @customElement
 * @polymer
 */
class VistaDatosDeEnvio extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-datos-de-envio';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaDatosDeEnvio.is, VistaDatosDeEnvio);
