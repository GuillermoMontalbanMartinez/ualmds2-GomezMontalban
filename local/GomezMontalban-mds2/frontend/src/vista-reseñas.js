import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-rese�as`
 *
 * VistaRese�as element.
 *
 * @customElement
 * @polymer
 */
class VistaRese�as extends PolymerElement {

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
        return 'vista-rese�as';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaRese�as.is, VistaRese�as);
