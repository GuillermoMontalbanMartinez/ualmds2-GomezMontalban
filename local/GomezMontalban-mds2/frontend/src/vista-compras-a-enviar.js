import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-compras-a-enviar`
 *
 * VistaComprasAEnviar element.
 *
 * @customElement
 * @polymer
 */
class VistaComprasAEnviar extends PolymerElement {

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
        return 'vista-compras-a-enviar';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaComprasAEnviar.is, VistaComprasAEnviar);
